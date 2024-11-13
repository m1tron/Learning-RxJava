import os
import re

# Iterate over each Chapter0X folders
for chapter_folder in os.listdir():
    if chapter_folder.startswith("Chapter0") and os.path.isdir(chapter_folder):
        print(f"Processing folder: {chapter_folder}")
        
        # Find all .java
        for file_name in os.listdir(chapter_folder):
            if file_name.endswith(".java"):
                java_file = os.path.join(chapter_folder, file_name)
                print(f"Found Java file: {java_file}")
                
                # Perform operations on each .java file
                with open(java_file, 'r') as file:
                    content = file.read()

                # Remove package line
                content = re.sub(r'\Apackage .*\n', '', content)

                # Update outdated imports
                content = re.sub(r"reactivex\.([A-Z])", r"reactivex.rxjava3.core.\1", content)
                content = re.sub(r"reactivex\.([a-qs-z])", r"reactivex.rxjava3.\1", content)

                # Save changes back to the file
                with open(java_file, 'w') as file:
                    file.write(content)

                print(f"Updated Java file: {java_file}")

print("Processing complete.")
