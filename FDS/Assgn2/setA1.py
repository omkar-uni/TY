#q1
'''import numpy as np
data=np.array([[1,0],[2,3]])
print("Original Array :",data)
print("max value ",np.max(data))
print("min value",np.min(data))'''

#q2
'''import numpy as np
point1=np.array([1,2,3])
point2=np.array([1,1,3])
dist=np.linalg.norm(point1-point2)
print("Dist = ",dist)
'''

#q3

'''import pandas as pd 
from scipy.stats import iqr
import numpy as np
d={'score':[50,80,60,100,60],'name':['O','M','K','A','R']}
df=pd.DataFrame(d)
print(df)
r=max(df['score'])-min(df['score'])
print("\nvalue of range in distribution:",r)
col=df['score']
ms=col.mean()
print("Average Score:",ms)
q3,q1=np.percentile(col,[100,50])
iqrvalue=q3-q1
print("Interquartile range:",iqrvalue)'''

#q4
'''import pandas as pd 
from scipy.stats import iqr
import numpy as np
import matplotlib.pyplot as plt
def sum(x,y,n):
     s=0
     for i in range(n):
          for j in range(i+1,n): 
               s+=(abs(x[i]-x[j])+abs(y[i]-y[j]))
     return s
x=[1,2,3,4]
y=[4,3,2,1]
n=len(x)
print("sum = ",sum(x,y,n))'''     


#q5
'''import pandas as pd 
from scipy.stats import iqr
import numpy as np
import matplotlib.pyplot as plt
n=np.array([0,1,2,3,3,4,5,7])
b = np.array([0,1,2,3])  
print("NUMS : ",n)
print("BINS : ",b)
print("\n")
plt.hist(n,b,edgecolor='orange',alpha=0.4)
plt.show()'''    

#q6
import pandas as pd 
import scipy.stats as s
import numpy as np
import matplotlib.pyplot as plt
d={'percent':[50,80,60,100,60],'name':['O','M','K','A','R'],'age':[50,30,60,10,60]}
df=pd.DataFrame(d)
print(df)
print("Average Score:",s.tmean(df['age']).round(2))
print("Avg Percentage : ",s.tmean(df['percent']).round(2))
print(df.describe())







