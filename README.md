Demo project for Building spring boot and CD/CI with Maven, Github Actions, Docker, Kubernetes

+ Stages: (in progress...) 
  - Checkout source code + compile
  - Unit test
  - Build + deploy to Nexus
  - Docker build image 
  - Push to docker hub
  - Deploy new version by Kubernetes

Cd/ci status:  [![Gihub action CI with Docker](https://github.com/quangkhai88/demo/actions/workflows/maven.yml/badge.svg?branch=master&event=push)](https://github.com/quangkhai88/demo/actions/workflows/maven.yml)

Quality gate (sonar cloud):  [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=quangkhai88_demo&metric=alert_status)](https://sonarcloud.io/dashboard?id=quangkhai88_demo)

Docker image: docker pull kakaict/github-action-cd-ci:lastest

