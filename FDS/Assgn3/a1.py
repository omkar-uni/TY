import pandas as pd
from sklearn.preprocessing import OneHotEncoder
from sklearn.preprocessing import LabelEncoder
df=pd.read_csv("Data.csv")
print(df.describe())
print("Shape of Dataset : ",df.shape)
print("First 3 Rows : \n",df.head(3))
valueMean=df['Age'].mean()
df['Age'].fillna(valueMean,inplace=True)
print(df)
valueSal=df['Salary'].mean()
df['Salary'].fillna(valueSal,inplace=True)
print(df)
print("\n\n")
df['Purchased']=LabelEncoder().fit_transform(df['Purchased'])
print(df)

enc=OneHotEncoder(handle_unknown='ignore')
enc_df=pd.DataFrame(enc.fit_transform(df[['Country']]).toarray())
print(enc_df)
