package stormLearn;

import java.util.Map;
import java.util.Random;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;


public class RandomSpout extends BaseRichSpout {
	private SpoutOutputCollector collector;
	private static String[] words = {"happy","excited","angry"};

	public void open(Map conf, TopologyContext context,
			SpoutOutputCollector collector) {
		// TODO Auto-generated method stub
		this.collector=collector;
	}

	public void nextTuple() {
		// TODO Auto-generated method stub
		String word = words[new Random().nextInt(words.length)]; 
	    collector.emit(new Values(word));
	}

	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		declarer.declare(new Fields("randomstring"));
	}

}
