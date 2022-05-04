cucumber-jvm-template
=====================

This is a template project that you can use to start with cucumber-jvm and selenium java tests. Read about it on [seleniumframework.com](http://www.seleniumframework.com/cucumber-jvm-3/cucumber-jvm-and-selenium/)

# Full Tutorials

[Basic Tutorial](http://www.seleniumframework.com/cucumber-jvm-3/cucumber-jvm-and-selenium/)  
[Intermediate Tutorial](http://www.seleniumframework.com/cucumber-jvm-3/parameterize-browser/)  
[Advanced Tutorial/Frameworks](http://www.seleniumframework.com/cucumber-jvm-3/what-are-frameworks/)


# Nginx Config
```sh
server {
    listen       443 ssl http2 default_server;
    ...
	location /ExecutionReports/ {
        autoindex on;
        root /home/centos/project/sg-altonomy-qa;
    }
    location /target/ {
        autoindex on;
        root /home/centos/project/sg-altonomy-qa;
    }
    location /reports {
        # rewrite ^/(.*)$ /ExecutionReports/ redirect;
        return 301 /ExecutionReports/;
    }
    location /cucumber {
        # rewrite ^/(.*)$ /target/ redirect;
        return 301 /target/;
    }
    ...
}
```