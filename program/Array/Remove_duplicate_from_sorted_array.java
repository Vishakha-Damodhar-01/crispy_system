
default boiler plate of problem

  
  int i=0;
for(int j=1;j<nums.length;j++)
  {
    if(num[i]!=num[j])
    {
      num[i+1]=num[j];
      i++;
    }
  }
return i+1;

this is how it returns the number of counts of uniques elements
