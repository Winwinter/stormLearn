package stormLearn;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Tuple;
import backtype.storm.tuple.Values;

public class SenqueceBolt extends BaseBasicBolt {

	public void execute(Tuple input, BasicOutputCollector collector) {
		// TODO Auto-generated method stub
		 String word = (String) input.getValue(0);  
         String out = "I'm " + word +  "!";  
         System.out.println("out=" + out + " " + Thread.currentThread().getName());
         collector.emit(new Values(out));
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		declarer.declare(new Fields("abcdefg"));
	}

}
