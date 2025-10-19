# Step 1: Use an official lightweight JDK image
FROM openjdk:17-jdk-slim

# Step 2: Set working directory inside the container
WORKDIR /app

# Step 3: Copy only UserInfo.java into the container
COPY src/UserInfo.java .

# Step 4: Compile the Java file
RUN javac UserInfo.java

# Step 5: Run the compiled program
CMD ["java", "UserInfo"]