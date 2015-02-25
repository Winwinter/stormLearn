package stormLearn;

import backtype.storm.topology.BasicOutputCollector;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseBasicBolt;
import backtype.storm.tuple.Tuple;

public class CountBolt extends BaseBasicBolt {
	private int count=0;
	public void execute(Tuple input, BasicOutputCollector collector) {
		// TODO Auto-generated method stub
		 String word = (String) input.getValue(0);  
		 word = input.getFields().get(0);
         count++;
         System.out.println("out=" + word + " " + "count="+count+" "+ Thread.currentThread().getName());
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub

	}

}
