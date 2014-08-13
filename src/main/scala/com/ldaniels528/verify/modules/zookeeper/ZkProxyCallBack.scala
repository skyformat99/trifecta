package com.ldaniels528.verify.modules.zookeeper

import org.apache.zookeeper.WatchedEvent

/**
 * ZooKeeper Call Back
 * @author lawrence.daniels@gmail.com
 */
trait ZkProxyCallBack {

  def process(event: WatchedEvent)

}