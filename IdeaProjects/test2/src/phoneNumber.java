public class phoneNumber {
    public String phoneNumber( int numbers[]){
        String str = "() - ";
        StringBuilder stb = new StringBuilder(str);
        String firstThird = "";
        for(int i = 0; i <=2;i++){
            firstThird+= numbers[i];
        }
        String secondThird = "";
        for(int i = 3; i <=5;i++) {
            secondThird += numbers[i];

        }

        String finalThird ="";

        for(int i = 6; i <=9;i++) {
            finalThird += numbers[i];
        }

        stb.insert(1,firstThird);

        stb.insert(6,secondThird);

        stb.insert(10,finalThird);

        return String.valueOf(stb);
    }


}
