package test.common.zookeeper;

import org.apache.zookeeper.*;

/**
 * Created by Administrator on 2017/2/23.
 */
public class ZkTest {
    private static String connectString="192.168.49.128:2181";
    private static int sessionTimeout=999999;
    public static void main(String[] args) throws Exception{
        Watcher watcher = new Watcher(){
            public void process(WatchedEvent event) {
                System.out.println("监听到的事件："+event);
            }
        };
        final ZooKeeper zookeeper = new ZooKeeper(connectString,sessionTimeout, watcher);
        System.out.println("获得连接：" + zookeeper);
        String path1 = zookeeper.create("/zk1", "".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
        System.out.println("创建节点:" + path1);
        final byte[] data = zookeeper.getData("/zk1", watcher, null);
        System.out.println("读取的值：" + new String(data));
        zookeeper.close();
    }
}
