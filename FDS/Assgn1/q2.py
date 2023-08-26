import pandas as pd
import matplotlib.pyplot as p
df=pd.read_csv('SOCR-HeightWeight.csv')
print("\nFirst 10 rows : \n ",df.head(10))
print("\Last 10 Rows:\n ",df.tail(10))
print("\nRandom 20 rows: \n",df.sample(20))
print("Rows and Columns : \n",df.shape)
print("\nDataType : \n",df.dtypes) 
print("\nBasic Statistical data : \n",df.describe())
print("\nmissing values : ",df.isnull())
df["bmi"]=(df['Weight(Pounds)']/(df['Height(Inches)']**2))
p.scatter(df['Height(Inches)'],df['Weight(Pounds)'])
p.show()
print(df) 

