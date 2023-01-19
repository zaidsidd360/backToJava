#!/bin/bash 

git add .

git status

echo "Enter commit message: "
read commitmsg

git commit -m "$commitmsg"

echo "Enter branch name: "
read branch

git push origin $branch