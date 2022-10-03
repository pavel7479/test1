package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean(UniLibrary.class);

        uniLibrary.getBook();
        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();
////        uniLibrary.returnBook();

//        SchoolLibrary schoolLibrary = context.getBean(SchoolLibrary.class);
//        schoolLibrary.getBook();

        context.close();
    }
}
