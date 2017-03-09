package test.common.test.dtdl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/3/9.
 */
class Father {
    protected void say(String name) {
        System.out.println("I am " + name);
    }
}
class CglibProxyIns implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before");
        Object r = methodProxy.invokeSuper(o, objects);
        System.out.println("after");
        return r;
    }
}
public class CglibProxy {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Father.class);
        enhancer.setCallback(new CglibProxyIns());
        Father son = (Father)enhancer.create();
        son.say("ppap");
    }
}
