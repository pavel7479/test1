package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary(){}
//    @Pointcut("execution(* aop.UniLibrary.returnMagazine(..))")
//    private void allMethodsFromUnilibraryReturn(){}
//    @Pointcut("allMethodsFromUnilibrary() && !allMethodsFromUnilibraryReturn()")
//    private void allMethodsFromUnilibraryExseptReturn(){}
//
//    @Before("allMethodsFromUnilibraryExseptReturn()")
//    public void beforeLoggingAdvice(){
//        System.out.println("beforeLoggingAdvice: пишем лог #10");
//    }


//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    private void allGetMethodsFromUnilibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUnilibrary(){}
//
//    @Pointcut("allReturnMethodsFromUnilibrary() || allGetMethodsFromUnilibrary()")
//    private void allGetAndReturnMethodsFromUnilibrary(){}
//
//
//    @Before("allGetMethodsFromUnilibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: пишем лог #1");
//    }
//    @Before("allReturnMethodsFromUnilibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice: пишем лог #2");
//    }
//    @Before("allGetAndReturnMethodsFromUnilibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: пишем лог #3");
//    }
//

    @Before("aop.aspects.MyPointcuts.allGetMethod()")
    public void beforeGetBooksAdvice() {
        System.out.println("beforeGetBooksAdvice: попытка получить книгу / журнал");
    }
    //    @Before("execution(public * returnBook())")
//    public void beforeReturnBooksAdvice() {
//        System.out.println("beforeReturnBooksAdvice: попытка вернуть книгу");
//    }
}
