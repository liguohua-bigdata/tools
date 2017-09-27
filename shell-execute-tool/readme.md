curl -s 'http://localhost:50001/execFile?ipAddress=10.100.134.3&userName=root&passWord=12345678&shellPath=/cloudstar/test.sh'

服务端口：       http://localhost:50001/execFile
目标机器IP：     ipAddress=10.100.134.3
目标机器账号：   userName=root
目标机器密码：   passWord=12345678
目标机器shell：  shellPath=/cloudstar/test.sh

curl -s 'http://localhost:50001/execCmd?ipAddress=10.100.134.3&userName=root&passWord=12345678&cmd=echo hello'

服务端口：       http://localhost:50001/execCmd
目标机器IP：     ipAddress=10.100.134.3
目标机器账号：   userName=root
目标机器密码：   passWord=12345678
目标机器shell：  shellPath=/cloudstar/test.sh


