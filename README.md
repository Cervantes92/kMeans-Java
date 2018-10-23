# kMeans-Java
Java implementation of kMeans cluster algorithms.

<h2>What is kMeans cluster analysis</h2>
<p>kMeans cluster analysis is an algorithm which is used to identify the center of clusters in a cluster field.
kMeans analysis is a form of unsupervised machine learning, meaning that the algorithm does not map a function
to an input.</p>

<h2>How does it work</h2>
<p>The algorithm takes a cluster field described as a series of points and the number of clusters in the field.
A number of potential centers are placed on the board and each point is associated with its nearest potential
center. The potential centers are then moved to the average location of their associated points and the points
in the clusterfield are rechecked for their nearest center. The process repeats until the centers stabilize.</p>
