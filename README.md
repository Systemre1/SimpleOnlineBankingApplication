# SimpleOnlineBankingApplication

![image](https://user-images.githubusercontent.com/80685689/131997929-b9c8d806-b7ab-456e-9208-7e9ee54df99f.png)
> I created the user class. Then I created the variables you wanted.
----

![image](https://user-images.githubusercontent.com/80685689/131997959-0657152f-3b77-4997-995b-c2bac0e336a1.png)
> I created an empty constructor so that the uses do not fail.
----

![image](https://user-images.githubusercontent.com/80685689/131997982-452b4889-aa22-4a7b-835a-8a413e46f624.png)
> I created accessor and mutator to all of them as you like.
----

![image](https://user-images.githubusercontent.com/80685689/131998004-837261f4-31f1-41a9-8380-295ecf395daf.png)
> I created an account class. Then extends him the user. I said let me establish heredity logic even if I don't use it. Then I created the scanner object. Because I would use it in methods here. I created the variables you want. I randomly created iban and account. It would be a little strange for the user to enter. I created an empty constructor here.
----

![image](https://user-images.githubusercontent.com/80685689/131998027-5f48e807-62c4-4cc3-aebd-d7c56e6fb7d3.png)
> I created the accessors and mutators. I didn't take them as a screenshot to avoid unnecessary extension. I just put the balance amount limit. Because it makes more sense to adjust this according to the balance.
----

![image](https://user-images.githubusercontent.com/80685689/131998052-3a413102-f94f-4afe-8e33-635563acacd6.png)
> Here I have created a method that controls whether you can do eft. He prints the balance amount on the screen and asks the amount of eft to be made as input. Then he checks if there is enough balance and returns a boolean expression.
----

![image](https://user-images.githubusercontent.com/80685689/131998075-cf0a90b9-4032-4e86-b55a-1eca37b299a2.png)
> This method works according to the incoming boolean expression. If it is true, it adjusts the amount of money. It then outputs the screen.
----

![image](https://user-images.githubusercontent.com/80685689/131998092-ae68d96c-117f-4728-a43b-986dd7a3d607.png)
> I created a credit card class. Then I heredity with the logic that every card has to have an account. I created the variables you want. I randomly created the credit card number. I also randomly generated your debt and minimum debt.
----

![image](https://user-images.githubusercontent.com/80685689/131998214-0d43ddf4-7250-45fd-9768-07c612097fea.png)
> I created two withdrawal methods (with and without parameters). I checked the balance and included a withdrawal accordingly.
----

![image](https://user-images.githubusercontent.com/80685689/131998228-34d986ab-5503-4772-ac93-be6d83c23d1d.png)
> I created a debt payment method here. This method firstly looks at the amount of money in your account and then processes debt payments. If it meets the conditions, it will reset your debt and update your balance amount.
----

![image](https://user-images.githubusercontent.com/80685689/131998249-c0e8e4e1-19dd-412f-9fc8-d837c6ae8af1.png)
> I created the mainPanel class where I will do the menu operations. I called the static menu method for.
----

![image](https://user-images.githubusercontent.com/80685689/131998262-b99f87bd-2646-4107-91ad-c278310b0b00.png)
> I created a menu method here. I received input from the user.
----

![image](https://user-images.githubusercontent.com/80685689/131998279-0982a57e-4fbe-466c-8560-77e68051f0e3.png)
> If the user chose to register, I took all the information and made user assignments.
----

![image](https://user-images.githubusercontent.com/80685689/131998333-09082167-2088-43ea-85e0-06bd35043495.png)
> I asked the user to log in after registration. I asked him to enter mail and password. And I compared its entries with the equals method of the String class. If true, I continued. If it's wrong, I asked him to re-enter. Then I called the addAccount and addCreditCard methods.
----

![image](https://user-images.githubusercontent.com/80685689/131998383-fb15792b-765a-4924-b3af-b803bfa2dbb2.png)
> It is a method I created for adding accounts. I created an infinite loop because if I entered an incorrect number, I wanted to get it again. I asked the user to write how many accounts he wanted to create. I directed if statements according to him.
----

![image](https://user-images.githubusercontent.com/80685689/131998445-a8040e0b-003d-4c7d-9f33-bba8cbc73798.png)
![image](https://user-images.githubusercontent.com/80685689/131998449-17712d9f-bef2-4efe-bdd0-6b00e171fd3f.png)
> Since addAccount is too long, I gonna just explain this code because I have always applied other if else statements the same logic stacked. Here the user wanted to create 2 accounts. I ask how much money he wants to deposit in the accounts and throw the money into his balance. Then I print all the information. Then I ask which account you want to eft because you have two accounts. If he doesn't want to do it, I want him to press 0 twice. Let's say we want to do, we are doing eft according to the amount entered from the first account he entered into the second account he entered. I am using the doEft method here. (I want it to be re-entered if it enters a non-existing account) If it wants to create more accounts, it can select other options. But since I do the same logic in those options, I am not telling the report in order not to extend the report unnecessarily.
----

![image](https://user-images.githubusercontent.com/80685689/131998474-bca912e3-27f0-44bf-8486-5a7a8f356e57.png)
> Here I just applied the same logic as. I asked how many credit cards you want to buy. (Max 2) But I also chose not to take it here because not everyone who has an account has a credit card. After the selection, I asked for the limit of the card and made the assignment. Then I printed the screen to learn the card information. If he entered the number of cards he wanted incorrectly, I wanted it again.
----
