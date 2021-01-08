# Apple Health Data Summary

Quick script to read an exported Apple Health Data(XML format) and produce various statistics about
activity and workouts.

## Motivation

I built this because I wore my Apple Watch every day during 2020, and wanted to quickly be able to 
produce year-end statistics.

## Export Apple Health Data

You'll need to export your Apple Health Data first; I was able to do so using my iPhone and then AirDropped it
to my Macbook.

1. Open the Health app on your phone.
2. Click on your Profile picture in the top right corner.
3. Scroll down to "Export All Health Data" and press.
4. Wait.
5. Airdrop the archive to your laptop and unzip it.
6. The file you'll want to pass into this script is named `export.xml`.

## Output

Right now, this script simply aggregates workout data by workout type.