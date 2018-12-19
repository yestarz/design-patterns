package link.yangxin.design.pattern.builder;

/**
 * 建造者模式
 * 优点：
 * 1、产品本身与产品的创建过程进行解耦，使用相同的创建过程来得到不同的产品。
 * 2、复杂的产品对象的创建过程进行拆分，分解在不同的方法中，流程更加清晰。
 * 3、添加新的具体建造者，无需对原有代码进行修改。
 * 缺点：
 * 1、创建的产品一般具有较多的共同点，如果产品之间的差异较大，那么就不适合建造者模式。
 * @author yangxin
 * @date 2018/11/16
 */
public class App {

    public static void main(String[] args) {
        // 指挥者
        Director director = new Director();

        // 具体的商品（产品）
        Product product;

        IBuilder redBuilder = new ProductRedBuilder();
        director.build(redBuilder);

        product = redBuilder.getProducts();

        System.out.println(product);


        IBuilder blackBuilder = new ProductBlackBuilder();
        director.build(blackBuilder);

        product = blackBuilder.getProducts();
        System.out.println(product);


    }

}