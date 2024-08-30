## What & Why
- Kubernetes is the operating system of the cloud
- A bunch of VMs who are able to communicate properly with each other and to divide their workload

## [[Overview.canvas|Cluster]]

## Pods
A pod is a the smallest unit that is scheduled on the node
Create pods: 
``k run httpd --image=httpd

- A pod is not a container! 
- A pod is a collection of containers and other ressources
- Types of pods:
	- Single container
	- Multi container
	- Initcontainer
		- This container needs to run successfully, before other containers in this pod can run
		- If not, the pod fails
		- (for example: Testing db connection)
		- Conditional Deployments
- Pod definition also contains information about the networking
	- Name
	- Namespace
	- IP
	- a.o.
- Pod also includes storage
	- Containers can all use the same storage

## Control Plane
- Handles API requests
- Includes:
	- Scheduler
	- API Server
	- ETCD
	- a.o. 

How does a pod end up on a node?
- API Server takes the request that comes on port 6443 (configured in ./kube/config)
- API Server forwards the request to the scheduler
- Scheduler decides what to do with the request
