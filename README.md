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

<h2>What this program does</h2>
<p>This program first parses a CSV file into a string array indexed by every new line, then each line is parsed
into two doubles which are then stored in a 2-dimensional array. A series of potential centers are chosen across
the minimum space the cluster field inhabits and the points in the clusterfield are assigned to their nearest
potential center as described through a "relations" array. The "relations" array is then used as reference to calculate
the average position of the potential clusters, and the potential centers are assigned these averages. The points in the clusterfield are then rechecked and re-associated with their nearest potential center, and the process repeats until
the sum of the changes of the center meet a predetermined stability threshold.</p>

<h2>Future changes</h2>
<ul>
  <li>Storing each point and clusters as objects, rather than elements of an array may make it easier to implement other clustering algorithms.</li>
  <li>Further optimization can be done to how the calculations are performed.</li>
  <li>Input sanitation and support for multiple dimensions</li>
  <li>User interface</li>
</ul>
