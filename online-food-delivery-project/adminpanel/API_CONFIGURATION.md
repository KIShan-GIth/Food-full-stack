# API Configuration Guide

## Problem
The application was using hardcoded `localhost:8080` URLs, which won't work when your backend is deployed on AWS.

## Solution
The code has been updated to use environment variables. Follow these steps:

### Step 1: Create Environment File
Create a `.env` file in the root directory (same level as `package.json`) with the following content:

```env
# Backend API URL
# For local development, use: http://localhost:8080
# For AWS deployment, use your AWS backend URL
VITE_API_URL=http://localhost:8080
```

### Step 2: Update for AWS Deployment
Replace `http://localhost:8080` with your actual AWS backend URL. For example:

```env
VITE_API_URL=https://your-api-domain.com
# OR
VITE_API_URL=https://your-api-gateway-url.execute-api.region.amazonaws.com
```

### Step 3: Restart Development Server
After creating or updating the `.env` file, restart your development server:

```bash
npm run dev
```

## Common Issues

### 1. CORS Errors
If you see CORS errors, make sure your AWS backend has CORS configured to allow requests from your frontend domain.

### 2. Connection Refused
- Verify your AWS backend URL is correct
- Check if your backend is running and accessible
- Ensure security groups/network settings allow connections

### 3. 404 Not Found
- Verify the API endpoints match: `/api/foods` and `/api/orders`
- Check your backend routing configuration

## Testing
After configuration, try adding a food item. The error message will now show more details if something goes wrong, helping you debug the issue.

