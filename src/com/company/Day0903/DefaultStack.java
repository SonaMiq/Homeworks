package com.company.Day0903;

public class DefaultStack implements Stack{

    private final int MAX_SIZE=5;
    private int[] nums;
    private int index=0;

    @Override
    public void push(int val) {
        if(index>=MAX_SIZE){
            throw new StackIndexOutOfBoundsException(index+" not found");
        }
        if(nums==null){
            nums=new int[MAX_SIZE];
        }
        this.index++;
        this.nums[index-1]=val;


    }

    @Override
    public int pop() {
        if(nums==null){
            throw new EmptyStackException("Stack is empty");
        }
       if(index==0){
           nums=null;
       }
       else index--;
        return nums[index];
    }
}
