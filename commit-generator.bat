for /l %%x in (1, 1, 100) do (
   echo %%x
   java CommitGenerator
   git add .
   git commit -m "New Changes"
)