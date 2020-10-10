public class LogTable {
    public static void main(String [] args){
        int x = 10;
   
        System.out.println("<html>\n<body>\n<table>\n<tr><th>" + x + "</th><th>" + Math.log(x) +" </th></tr>");
        for(int i = 0; i < x; i++){
            System.out.println("<tr><th>" + i + "</th><th>" + Math.log(i) +" </th></tr>");
        }
        System.out.println("</table>\n</body>\n</html>");
        
    }
}
