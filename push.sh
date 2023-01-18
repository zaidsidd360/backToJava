#!/bin/bash 

git add .

echo "Enter commit message: "
read commitmsg

git commit -m "$commitmsg"

echo "Enter branch name: "
read branch

git push origin $branch