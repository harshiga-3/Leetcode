class Duplicate {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer>m=new HashMap<>();
List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
         
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
         
         
        }

        for(int n:m.keySet())
        {
            if(m.get(n)==2)
            {
                l.add(n);
            }
        }

return l;
    }
}