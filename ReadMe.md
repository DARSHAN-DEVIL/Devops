# commands of Devops

# after pull error

git pull origin main --rebase

git add . 
git rebase --continue
git fetch origin
git commit -m "Resolved merge conflicts"
git push -f origin main
