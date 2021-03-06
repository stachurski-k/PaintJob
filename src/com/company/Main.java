package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4,2.1,1.5,2));
        System.out.println(getBucketCount(3.4,2.1,1.5));
    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets ){
        if(width <=0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        } else {
            double area = width * height;
            double usingExtraBuckets = areaPerBucket * extraBuckets;
            double howMuchHeNeeds = (area - usingExtraBuckets) / areaPerBucket;

            return (int)Math.ceil(howMuchHeNeeds);
        }
    }
    public static int getBucketCount(double width,double height, double areaPerBucket){
        if (width <=0 || height <=0 || areaPerBucket <=0){
            return -1;
        }
          double areaCounted = (width * height) / areaPerBucket;

        return (int)Math.ceil(areaCounted);
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <=0 || areaPerBucket <=0 ){
            return -1;
        }
        double areaCounted = area / areaPerBucket;
        return (int)Math.ceil(areaCounted);
    }
}
