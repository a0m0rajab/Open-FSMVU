#!/bin/bash 
declare -i x=1

for i in *.png;
do 
mv "$i" "foto$x.png"
x+=1    
# echo $x 
# echo $i
done 