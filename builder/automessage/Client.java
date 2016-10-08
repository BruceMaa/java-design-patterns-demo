
public class Client {

    public static void main(String[] args) {

        //Builder builder = new WelcomeBuilder();
        //Director director = new Director(builder);
        //director.construct("toAddress@126.com", "fromAddress@126.com");
        
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123L, 456L);

        InsuranceContract contract = builder.setPersonName("小明").setOtherData("test").build();
        contract.someOperation();
    }
}
