package nettyLearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class OutboundHandler2 extends ChannelOutboundHandlerAdapter implements
		ChannelHandler {
	 private static Logger   logger  = LoggerFactory.getLogger(OutboundHandler2.class);  
     
	    @Override  
	    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {  
	        logger.info("OutboundHandler2.write");  
	        // 执行下一个OutboundHandler  
	        super.write(ctx, msg, promise);
	    }  
}
