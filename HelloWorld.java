public class HelloWorld{
    public static void main(String[] args){
        //社員1を作る
        object shain1 = new object();
        shain1.setId(20252029);
        shain1.setName("Kairi");
        shain1.setSei("Shimizu");
        shain1.setNen(2000);

        System.out.println(shain1.getId()+":"+shain1.getName()+":"+shain1.getSei()+":"+shain1.getNen());
    }
}