#!/bin/bash
sudo docker pull beomjun2218/steady:latest
sudo docker run -d -p 8080:8080 beomjun2218/steady:latest
