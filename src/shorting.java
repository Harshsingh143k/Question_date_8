public class shorting {
    public static void main(String[] args) {
        String str="I am  aaa abc acd most the best";
        System.out.println(str.length());
       String  strArr[]=str.split(" ");
       String temp;
//        for (int i = 0; i <strArr.length ; i++) {
//
//
//            System.out.println(strArr[i]+" ");
//        }
//        System.out.println(strArr[1].length());

        for (int i = 0; i <strArr.length-1 ; i++) {
            for (int j = 0; j < strArr.length-1-i; j++) {

                if(strArr[j].length()<=strArr[j+1].length()){
                    if(strArr[j].length()==strArr[j+1].length()) {
                        temp="";



                    temp=strArr[j];
                    strArr[j]=strArr[j+1];
                    strArr[j+1]=temp;
                }


            }

        }
        }
        for (int i = 0; i <strArr.length; i++) {
            System.out.println(strArr[i]);

        }


        //String arr[]=new
    }
}
