
import java.util.*;

public class A0 {
    public static void main(String [] args) {
        ArrayList<String> veg = new ArrayList<>(Arrays.asList("cabbage","carrot","onion","green onions","avocado","garlic","bell pepper","pepper","leeks","tomato"));
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apples","watermelon","melon","orange","pineapples","banana","blood orange","lychee","kiwi","pear"));
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("bapples","watermelon","melon","orange","pineapples","banana","coconut","lychee","kiwi","pear"));
        ArrayList<String> animals = new ArrayList<>(Arrays.asList("Shark","Bird","Shark","Fish","Chicken","Horse","Cat","Dog","Whale","Fox"));
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(0,1,2,3,4,5));
        System.out.println(foodList(fruits,veg));
        System.out.println(duplicateFood(fruits, fruits2));
        System.out.println(duplicateAnimals(animals));
        System.out.println(addNum(nums,3));
        System.out.println(reverseOrder(nums));
        System.out.println(pairs1(nums));
        System.out.println(pairs2(nums));
        ArrayList<Point> points = pairs2(nums);
        System.out.println(midPoint(points));
        System.out.println(orderPoints(points));

    }

    public static ArrayList<String> foodList(ArrayList<String> fruits, ArrayList<String> veg) {
        ArrayList<String> combination = new ArrayList<String>(fruits);
        combination.addAll(veg);
        Collections.sort(combination);
        return combination;
    }

    public static ArrayList<String> duplicateFood(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> combination = new ArrayList<String>(list1);;
        combination.retainAll(list2);
        return combination;
    }

    public static ArrayList<String> duplicateAnimals(ArrayList<String> list1) {
        int sizeL = list1.size();
        for(int i = 0; i < sizeL; i++) {
            for(int j = i+1; j < sizeL; j++) {
                if(list1.get(i).equals(list1.get(j))) {
                    list1.remove(j);
                    sizeL--;
                    j--;   
                }
            }
        }
        return list1;
    }

    public static ArrayList<Integer> addNum(ArrayList<Integer> nums, int num) {
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        for(int i = 0; i < nums.size(); i++) {
            if(nums.get(i) < num && nums.get(i+1) > num) {
                newNums.add(nums.get(i));
                newNums.add(num);
            } else {
                newNums.add(nums.get(i));
            }
        }
        return newNums;
    }

    public static ArrayList<Integer> reverseOrder(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size()/2; i++) {
            int temp = nums.get(i);
            nums.set(i, nums.get(nums.size()-(i+1)));
            nums.set(nums.size()-(i+1), temp);
        }
        return nums;
    }

    public static List<List<Integer>> pairs1(ArrayList<Integer> nums) {
        List<List<Integer>> pairs = new ArrayList<List<Integer>>();
        for(int i = 0; i < nums.size()-1; i++){
            List<Integer> temp = new ArrayList<>(Arrays.asList(nums.get(i), nums.get(i+1)));
            pairs.add(temp);
            i++;
        }
        return pairs;
    }

    public static ArrayList<Point> pairs2(ArrayList<Integer> nums) {
        ArrayList<Point> pairs = new ArrayList<Point>();
        for(int i = 0; i < nums.size()-1; i++){
            pairs.add(new Point(nums.get(i), nums.get(i+1)));
            i++;
        }
        return pairs;
    }

    public static ArrayList<Point> midPoint(ArrayList<Point> nums) {
        ArrayList<Point> pairs = new ArrayList<Point>();
        for(int i = 0; i < nums.size()-1; i++){
            pairs.add((nums.get(i)));
            // if(i < nums.size()) {
                pairs.add(nums.get(i).getMidPoint(nums.get(i+1)));
            // }
        }
        pairs.add(nums.get(nums.size()-1));
        return pairs;
    }


    public static ArrayList<Point> orderPoints(ArrayList<Point> points) {
        for(int i = 0; i < points.size(); i++){
            int minI = i;
            for(int p = i+1; p < points.size(); p++){
                if(points.get(p).getDistanceOrigin() < points.get(minI).getDistanceOrigin()) minI = p;
            }
            Point bruh = points.get(minI);
            points.set(minI, points.get(i));
            points.set(i, bruh);
        }
        return points;
    }
}