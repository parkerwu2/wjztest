package test.jedis;

import redis.clients.jedis.Jedis;


public class Infrastructure {
    static String constr = "192.168.49.128" ;
    public static Jedis getRedis(){
//        Jedis jedis = new Jedis(constr, 5000) ;
        Jedis jedis = new Jedis(constr) ;
        jedis.auth("wjz"); // 一个是redis.conf里面把127.0.0.1注释掉，还有就是要设置密码 redis-cli进入以后config set requirepass wjz
        return jedis ;
    }
    public static void main(String[] args){
        Jedis j = Infrastructure. getRedis() ;
        String output ;
        j.set( "hello", "world" ) ;
        output = j.get( "hello") ;
        System. out.println(output) ;
    }
}
