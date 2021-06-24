script.sh
#!/bin/bash

echo "=== 將目前執行 process 的 PID 依照數字大小排序，取出前 10 名 === "
pwd
echo "=== 將目前執行 process 的 PID 依照數字大小排序，取出前 10 名 === "
source ./src/backend/crawler/venv/bin/activate
echo "=== 將目前執行 process 的 PID 依照數字大小排序，取出前 10 名 === "
python ./src/backend/crawler/crawler.py
echo "=== 將目前執行 process 的 PID 依照數字大小排序，取出前 10 名 === "
