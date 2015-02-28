package nettyLearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class InboundHandler1 extends ChannelInboundHandlerAdapter implements
		ChannelHandler {
	private static Logger   logger  = LoggerFactory.getLogger(InboundHandler1.class);  
	  
    @Override  
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {  
        logger.info("InboundHandler1.channelRead: ctx :" + ctx);  
        // 通知执行下一个InboundHandler  
        logger.info("InboundHandler1.channelRead working thread" + Thread.currentThread().getName());
        ctx.fireChannelRead(msg);  
    }  
  
    @Override  
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {  
        logger.info("InboundHandler1.channelReadComplete");  
        logger.info("InboundHandler1.channelRead working thread" + Thread.currentThread().getName());
    //    ctx.flush();  
    }  
}
