# Sentinel agents
Currently three sentinel agents are available and more are being planned and will be released in the near future.
* docker stats agent
* system stats agent
* logfile agent
* inline logging guidelines

In addition, it is very easy to use inline code to directly send your logs into sentinel. All agents are written in **Python3** and need **pip3** to install all dependencies.

## common configuration

## docker stats agent
The agent is located in the *sentinel-agents/dockerstats/* subdirectory in the downloaded git repository. To install all dependencies please use -

```
# pip3 install -f requirements.txt
```

The agent can simply be executed via this command -

```
$ python3 sentinel-docker-agent.py
```

## system stats agent
The agent is located in the *sentinel-agents/systemstats/* subdirectory in the downloaded git repository. To install all dependencies please use -

```
# pip3 install -f requirements.txt
```

The agent can simply be executed via this command -

```
$ python3 sentinel-sys-agent.py
```

## logfile agent
The agent is located in the *sentinel-agents/logparsing/* subdirectory in the downloaded git repository. To install all dependencies please use -

```
# pip3 install -f requirements.txt
```

The agent can simply be executed via this command -

```
$ python3 sentinel-log-agent.py
```

## inline logger guidelines