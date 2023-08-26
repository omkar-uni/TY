import pandas as pd
import matplotlib.pyplot as p
df=pd.DataFrame(columns=['name','age','percentage'])
df.loc[0]=['Omkar',20,50]
df.loc[1]=['Pranit',20,91]
df.loc[2]=['Varad',21,96]
df.loc[3]=['Rohit',17,69]
df.loc[4]=['Tejas',22,95]
df.loc[5]=['Ronaldo',20,88]
df.loc[6]=['Raj',20,90]
df.loc[7]=['Shriraj',20,96]
df.loc[8]=['Messi',20,88]
df.loc[9]=['Mahesh',20,93]
print(df)
print("Rows and Columns : \n",df.shape)
print("\nDataType : \n",df.dtypes)
print("\nFeature : \n",df.info()) 
print("\nBasic Statistical data : \n",df.describe())
df.loc[0]=['Suresh',19,69]
df.loc[1]=['Suresh',20,55]
df.loc[2]=['None',None,None]
df.loc[3]=['Ajay',19,93]
df.loc[4]=['Mahesh',18,98]
df["Remark"]=None
print("no of observation : ",df.shape[0])
print("\nmissing values : ",df.isnull())
print("\nDuplicae values : ",df.duplicated())
df.drop(columns=['Remark'],axis=1,inplace=True)
df=df.dropna()
print(df)
p.plot(df.name,df.percentage)
#p.scatter(df.name,df.percentage)
p.show()
