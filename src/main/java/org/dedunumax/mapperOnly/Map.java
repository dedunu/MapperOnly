package org.dedunumax.mapperOnly;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map extends Mapper<LongWritable, Text, Text, Text> {

	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		// Do what ever you want here
		context.write(value,null);
	}

}
