package org.bigdata;

import javax.security.auth.login.Configuration;
import org.apache.hadoop.mapreduce.Job;

import java.io.FileInputStream;
import java.io.IOException;

public class SingleMapper {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        Job job = Job.Instance(configuration, "City Temperature Job");
        job.setMapperClass(TemperatureMapper.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        job.setJar("target/uber-kelasBigData20221.0-SNAPSHOT.jar");

        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileInputFormat.addOutputPath(job, new Path(args[1]));

        System.exit(job.waitForCompletion(true)? 0 : 1);
    }
    private static class TemperatureMapper extends Mapper<Object, Text, TEXT, IntWritable>{
        public void map(Object key, value, Context context)
        {
            String txt =
        }
    }
}
