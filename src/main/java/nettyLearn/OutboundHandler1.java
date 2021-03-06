package nettyLearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class OutboundHandler1 extends ChannelOutboundHandlerAdapter implements
		ChannelHandler {
	 private static Logger   logger  = LoggerFactory.getLogger(OutboundHandler1.class);  
	    @Override  
	    // 向client发送消息  
	    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {  
	        logger.info("OutboundHandler1.write");  
	        logger.info("OutboundHandler1.write working thread" + Thread.currentThread().getName());
	        String response = "I am ok!";  
	        ByteBuf encoded = ctx.alloc().buffer(4 * response.length());  
	        encoded.writeBytes(response.getBytes());  
	        ctx.write(encoded);  
	        ctx.flush();  
	    }  
}
