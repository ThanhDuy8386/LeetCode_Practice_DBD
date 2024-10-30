public class B168_ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(700%26);
    }

    static String convertToTitle(int columnNumber) {
        if(columnNumber == 0) return "";
        String[] words = new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        // String result = "";
        // columnNumber--;
        // while(columnNumber != 0) {
        //     int temp = columnNumber % 26;
        //     result = words[temp]+result;
        //     columnNumber = (int)Math.floor(columnNumber / 26);
        // }
        columnNumber--;
        int temp = columnNumber % 26;
        String letter = words[temp];
        columnNumber = (int)Math.floor(columnNumber/26);
        return convertToTitle(columnNumber)+letter;
    }
}
