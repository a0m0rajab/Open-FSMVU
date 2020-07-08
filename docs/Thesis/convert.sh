#!/bin/bash 
for i in *.js;
do 
js2flowchart $i -o `echo $i | sed -e 's/svg$/png/'`; 
done
echo "Done converting to SVG"
for i in *.svg; 
do rsvg-convert $i -o `echo $i | sed -e 's/svg$/png/'`;
rm $i
echo "PNG file was created: $i"
done
echo "Done converting to PNG"

if [ -d images ]; then
    echo "images folder exist"
else 
    mkdir images
    echo "images folder created"
fi
mv *.png images

echo "Files moved to images folder"
# run by using bash convert.sh