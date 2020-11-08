import os
import json

my_path = os.path.realpath('.')

f = open(my_path + '/bread.json', 'r')
text = ''
while True:
    line = f.read()
    text += line
    if not line:
        break
f.close()
json_file = json.loads(text)

bread_type = input('breadType : ')

for arr in json_file:
    for key in arr:
        if key == 'breadType' and arr[key] == bread_type:
            for recipe_name, val in arr['recipe'].items():
                print(recipe_name, ':', val)
