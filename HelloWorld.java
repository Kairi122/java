import java.util.ArrayList;

public class HelloWorld{
        public static void main(String[] args){
        ArrayList<object> shainList = new ArrayList<>();
        //社員1を作る
        object shain1 = new object();
        shain1.setId(20252029);
        shain1.setName("Kairi");
        shain1.setSei("Shimizu");
        shain1.setNen(2000);
        shainList.add(shain1);


        object shain2 = new object();
        shain2.setId(20252031);
        shain2.setName("John");
        shain2.setSei("Smith");
        shain2.setNen(1999);
        shainList.add(shain2);

        System.out.println(shainList.get(0).getName());

        for(object obj : shainList){
            System.out.println(obj.getId()+":"+obj.getName()+":"+obj.getNen()+":"+obj.getSei());
        }
    }
}