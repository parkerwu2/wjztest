package test.common.test.dtdl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/3/9.
 */
interface TargetInterface {
    public void say(String name);
}
class Target implements TargetInterface{
    @Override
    public void say(String x) {
        System.out.println("I am " + x);
    }
}
class TargetHandle implements InvocationHandler {
    private TargetInterface t;
    public TargetHandle(TargetInterface target) {
        super();
        t = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object r = method.invoke(t, args);
        System.out.println("after");
        return r;
    }
}
public class JDKProxy {
    public static void main(String[] args) {
        TargetInterface targetInterface = new Target();
        TargetHandle handle = new TargetHandle(targetInterface);
        TargetInterface proxy = (TargetInterface)Proxy.newProxyInstance(targetInterface.getClass().getClassLoader(), targetInterface.getClass().getInterfaces(), handle);
        proxy.say("ppap");
    }
}
