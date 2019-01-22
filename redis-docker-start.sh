#!/bin/bash

docker run -it \
    --name redis \
    -p 6379:6379 \
    redis:5.0.3